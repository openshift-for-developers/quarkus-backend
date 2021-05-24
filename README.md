# The Cloud Ready Postit application
This is a sample application for the book, Getting Started with OpenShift.

It is a cloud ready postit application that is composed of:
- [a quarkus backend](https://github.com/openshift-for-developers/quarkus-backend)
- [a nodejs react frontend](https://github.com/openshift-for-developers/nodejs-frontend)
- and a mongodb database (optionally deployed)

## Application Topology
![Application topology](topology.png "Application Topology")

## Deployment
It is expected for readers of the book to follow the steps outlined in each chapter.  However we provide minimal quickstart instructions below.

You are able to run the quarkus application locally using the command:
`mvn compile quarkus:dev`

Note: this example app is derived from the [example at redhat-developer-demos/quarkus-reactjs-postit-app](https://github.com/redhat-developer-demos/quarkus-reactjs-postit-app).