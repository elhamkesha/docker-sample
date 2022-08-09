---- Read Me! ----
Author: Elham keshavarz

------------------------------
Services uri with sample:
GET /helloworld(without parameter): return "Hello Stranger"
GET /helloworld?name=AliAhmadi(with name parameter): return "Hello AliAhmadi"
GET /author: return "Ali Ahmadi"
------------------------------
Run docker image:
Default: docker run -d -p 8080:8080 image_name
With listening port(argument): docker run -d -p 8080:9000 image_name --server.port=9000

