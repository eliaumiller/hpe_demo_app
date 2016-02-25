var assert = require("assert");
//
//var argv = require('optimist').demand('config').argv;
//var configFilePath = argv.config;
console.log(process.argv);
//assert.ok(fs.existsSync(configFilePath), 'config file not found at path: ' + configFilePath)
//var config = require('nconf').env().argv().file({file: configFilePath})

describe('Array', function(){
  describe('#indexOf()', function(){
    it('run single test', function(){
      assert.equal(-1, [1,2,3].indexOf(5));
      assert.equal(-1, [1,2,3].indexOf(0));
    })
  })
})

describe('Array', function(){
    describe('print PARAM via environment variable ', function(){
        it('print url from environment variable',function(){
            var PARAM = process.env.PARAM;
            console.log("PARAM:"+PARAM);

        })
    })
})

