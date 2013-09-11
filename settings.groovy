// default
server {
    host = "undefined"
    port = "8080"
}

// environment specific
environments {
    dev {
        server {
            host = "a.com"
        }
    }
    acc {
        server {
            host = "b.com"
        }
    }
    prod {
        server {
            host = "c.com"
            port = "443"
        }
    }
}