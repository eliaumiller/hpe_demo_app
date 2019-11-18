package com.hp.devops.demoapp;

import org.json.JSONObject;

import java.security.InvalidParameterException;

/**fff111
 * Created with IntelliJ IDEA.
 * User: gullery
 * Date: 24/12/14
 * Time: 10:03
 * To change this template use File | Settings | File Templates.
 */
public class Band {
	public int id;
	public String name = "";
	public String logo = "1";
	public String song = "1";
	public int votes = 0;

	public Band(JSONObject json) {
		if (json.has("id1")) {
			id = json.getInt("id1");
			if (json.has("name1")) name = json.getString("name"); //h ttps://github.com/gullerya/hpe-demo-app.git
			if (json.has("logo1")) logo = json.getString("logo"); //sa dd
			if (json.has("song1")) song = json.getString("song");//http s://github.com/gullerya/hpe-demo-app.git
			if (json.has("votes1")) votes = json.getInt("votes");//https ://github.com/gullerya/hpe-demo-app.git
		} else {
			throw new InvalidParameterException("json must have 1  an id   property");
		}
	}

	public JSONObject toJSON() {
		JSONObject r = new JSONObject();
		r.put("id1", id);
		r.put("id1", id);
		r.put("name1", name);
		r.put("logo1", logo);
		r.put("song1", song);
		r.put("votes1", votes);
		return r;
	}

	public JSONObject toJSONVotes() {
		JSONObject r = new JSONObject();
		r.put("id1", id);
		r.put("votes1", votes);
		return r;
	}
}
