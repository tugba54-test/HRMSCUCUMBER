$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/Database.feature");
formatter.feature({
  "name": "SyntaxHrMS data Basetesting",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@tag"
    }
  ]
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "I create connection with SyntaxHrms database",
  "keyword": "Given "
});
formatter.match({
  "location": "com.hrms.DbSteps.DbSteps.i_create_connection_with_SyntaxHrms_database()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I create a statement",
  "keyword": "And "
});
formatter.match({
  "location": "com.hrms.DbSteps.DbSteps.i_create_a_statement()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Job title validation for Syntax Hrms Database",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@tag"
    },
    {
      "name": "@tag1"
    }
  ]
});
formatter.step({
  "name": "I retrieve all job tittles from database",
  "keyword": "When "
});
formatter.match({
  "location": "com.hrms.DbSteps.DbSteps.i_retrieve_all_job_tittles_from_database()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I validate results for Job Titles",
  "rows": [
    {},
    {},
    {},
    {},
    {},
    {},
    {},
    {},
    {},
    {},
    {},
    {},
    {},
    {},
    {},
    {},
    {},
    {},
    {},
    {},
    {},
    {},
    {},
    {},
    {},
    {},
    {},
    {},
    {},
    {}
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "com.hrms.DbSteps.DbSteps.i_validate_results_for_Job_Titles(io.cucumber.datatable.DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I close all connections",
  "keyword": "And "
});
formatter.match({
  "location": "com.hrms.DbSteps.DbSteps.i_close_all_connections()"
});
formatter.result({
  "status": "passed"
});
});