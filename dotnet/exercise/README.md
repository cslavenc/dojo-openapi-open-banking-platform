# Openapi in c#

## Hints

Using the [openapi-generator-cli](https://openapi-generator.tech/docs/installation):

- copy `openapi.yaml` from the solution folder to `.openapi/` or use your own file
- navigate to the `.openapi` folder
- `npx @openapitools/openapi-generator-cli generate -i openapi.yaml -g csharp -o ../gen`
- this still uses a number of default names and options. Try to modify them, e.g. try to name the API Interface to
  something other than `DefaultApi`.
