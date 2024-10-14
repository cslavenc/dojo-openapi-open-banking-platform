# dojo-openapi-open-banking-platform

In this dojo, we take a look at OpenAPI and how contract-first principles help us create RESTful APIs in a more
consistent and stable manner.

## Introduction

Read the system description of a fictive company called Alpine Banking AG which expresses its needs, wishes and
requirements to build an open banking platform in `DESCRIPTION.md`. Based on the text, create an openapi specification.
Check the API endpoints in `API-SAMPLE.md` for a possible interpretation of the text. The `diagrams` folder contains a class
and entity relationship diagram as a help to visualize the description, although it is not necessary to use it. In the
end, return default data from a controller in [Swagger UI](http://localhost:8080/swagger-ui/index.html). The exercise
folders provide skeleton code for controller and data classes which you can freely modify and adapt.

As the description is somewhat long, it is probably best to start with the first paragraph and implement an openapi
specification for that one only. This will likely have the best learning effect for newcomers. Later on, the other
paragraphs may be worked on too.

## Helpful links

- [Read the docs](https://swagger.io/specification/v3/)
- [online editor with pet store example](https://editor.swagger.io/)
- [an overview of openapi code generators](https://openapi-generator.tech/docs/generators)
- [java openapi generator walkthrough](https://www.baeldung.com/java-openapi-generator-server)
- [csharp generator](https://openapi-generator.tech/docs/generators/csharp/)
  - [example usage of the CLI generator](https://openapi-generator.tech/docs/usage#examples)
- [python generator](https://marcomuellner.github.io/openapi-python-generator/)

## Further Challenges

The examples and solutions are implemented for java. Try the same on your own for:

- csharp
- python
- nodejs
- c++
- rust
- go

Contributions are always welcome!

## Advanced topics

- [Arazzo: Workflows and API](https://spec.openapis.org/arazzo/latest.html)
- [AsyncAPI: generate event-driven code](https://www.asyncapi.com/en)
- [AsyncAPI vs OpenAPI](https://www.asyncapi.com/docs/tutorials/getting-started/coming-from-openapi)
- [Optic: the CI tool that improves your APIs](https://github.com/opticdev/optic)
