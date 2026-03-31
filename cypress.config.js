const { defineConfig } = require("cypress");

module.exports = defineConfig({
  allowCypressEnv: false,
  reporter: 'cypress-mochawesome-reporter', //for html reports
  e2e: {
    baseUrl:'https://google.co.in',
    
    env:{
      qa:'https://google.com',
      prod:'https://facebook.com'

    },
    video:true,
    setupNodeEvents(on, config) {
      // implement node event listeners here
      require('cypress-mochawesome-reporter/plugin')(on); //for html report
    },
  },
});
