/**
 * Created with IntelliJ IDEA.
 * User: gullery
 * Date: 24/11/14
 * Time: 11:32
 * 测试
 * To change this template use File | Settings | File Templates.
 */

'use strict';
(function() {

	var votable = document.cookie.indexOf('hpDevopsDemoApp') < 0;

	function setupVote() {
		var bandStrips = document.querySelectorAll('.bandStrip'), contentTitleEl = document.getElementById('contentTitle'), i, l;
		if(votable) {
			contentTitleEl.textContent = 'raise your voice and make your choice';
		} else {
			contentTitleEl.textContent = 'you have already stated your favorite, yet can cheet though :]';
		}
		for(i = 0, l = bandStrips.length; i < l; i++) {
			if(votable) {
				bandStrips[i].onmouseenter = function() {
					this.style.background = 'linear-gradient(0deg, #ccf, #aaf, #ccf)';
				};
				bandStrips[i].onmouseleave = function() {
					this.style.background = 'linear-gradient(0deg, #eee, #ccc, #eee)';
				};
				bandStrips[i].onclick = function() {
					vote(this.dataset.bandId, function(error, votes) {
						var stripEl, totalVotes = 0;
						if(error) {console.error(error);} else {
							votes.forEach(function(vote) {
								stripEl = document.querySelector('div[data-band-id="' + vote.id + '"]');
								stripEl.querySelector('.bandVotes').textContent = vote.votes;
								totalVotes += vote.votes;
							});
							votable = false;
							document.getElementById('totalVotes').textContent = 'total votes: ' + totalVotes;
							setupVote();
						}
					});
				};
			} else {
				bandStrips[i].style.background = 'linear-gradient(0deg, #eee, #ccc, #eee)';
				bandStrips[i].onmouseenter = null;
				bandStrips[i].onmouseleave = null;
				bandStrips[i].onclick = null;
			}
		}
	}

	function vote(bandId, callback) {
		var xhr = new XMLHttpRequest();
		xhr.open('put', '/api/band/' + bandId + '/vote');
		xhr.onerror = function() {callback('failed to get the bands data');};
		xhr.onload = function() {
			var votes;
			try {
				votes = JSON.parse(xhr.responseText);
				callback(null, votes);
			} catch(e) {callback(e);}
		};
		xhr.send();
	}

	function loadBands(callback) {
		var xhr = new XMLHttpRequest(), bands;
		xhr.open('get', '/api/bands');
		xhr.onerror = function() {callback('failed to get the bands data');};
		xhr.onload = function() {
			try {
				bands = JSON.parse(xhr.responseText);
				callback(null, bands);
			} catch(e) {callback(e);}
		};
		xhr.send();
	}

	function renderBands(bands) {
		var template, listElement, tmpElement, totalVotes = 0;
		template = document.getElementById('bandStripTemplate');
		listElement = document.getElementById('bandsList');
		bands.forEach(function(band) {
			template.content.querySelector('.bandStrip').dataset.bandId = band.id;
			template.content.querySelector('.bandLogo').src = band.logo;
			template.content.querySelector('.bandTitle').textContent = band.name.toUpperCase();
			template.content.querySelector('.bandVotes').textContent = band.votes;
			template.content.querySelector('.bandSong').src = band.song;
			tmpElement = document.importNode(template.content, true);
			tmpElement = listElement.appendChild(tmpElement);
			totalVotes += band.votes;
		});
		document.getElementById('totalVotes').textContent = 'total votes: ' + totalVotes;
	}

	loadBands(function(error, bands) {
		if(error) {
			console.error(error);
		} else {
			renderBands(bands);
			setupVote();
		}
	});
})();
