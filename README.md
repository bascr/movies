# Movie Service

This simple Movie Rest Service is built on top of Spring Boot and it can be used as a tutorial example. 

### Requirements

- Local MongoDB instance: On your local instance execute the next commands on MongoSh:

  - Switching to movies database

          > use movies
          switched to db movies
          >

  - Enable access control:

          > db.createUser({ user: "root",pwd:  "root", roles: [ { role: "readWrite", db: "movies" }]})
          succesfully added user: {
              "user": "root",
                  "roles": [
                      {
                           "role": "readWrite",
                           "db": "movies"
                      }
                  ]
          }  
          >

### Endpoints

- **Get all movies**:
  - method: get
  - path: /
  
    
- **Get movies by Id**:
  - method: get
  - path /{movieId}


- **Create movie**:
  - method: post
  - path: /create
  - payload:
  
        {
            "name": "jurassic park",
            "category": "Adventure Sci-Fi",
            "rating": "3"
        }


- **Update movie**:
  - method: put
  - path: /update/{movieId}
  - payload:

        {
            "name": "Mesozoic park",
            "category": "Adventure Sci-Fi",
            "rating": "5"
        }

- **Delete movies by Id**:
    - method: get
    - path /delete/{movieId}
