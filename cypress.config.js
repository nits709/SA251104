const { defineConfig } = require("cypress");

module.exports = defineConfig({
  allowCypressEnv: false,

  e2e: {
    baseUrl:'https://google.co.in',
    
    env:{
      qa:'https://google.com',
      prod:'https://facebook.com'

    },
    video:true,
    setupNodeEvents(on, config) {
      // implement node event listeners here
      
    },
  },
});
