let testData = `{
    "id": "101",
    "email": "selenium@Automaiton.com",
    "project_id": "EcommerceProject",
    "status": "active",
    "metadata": {
      "plan": "pro"
    }
  }`

  console.log(typeof testData)
  //console.log("id "+ testData.id)

  //convert string into json data
 let testJSDATA = JSON.parse(testData);
 console.log(typeof testJSDATA)

 console.log("id "+ testJSDATA.id)
 console.log("email "+ testJSDATA.email)