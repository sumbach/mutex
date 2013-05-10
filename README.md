# mutex

Lightweight Mutex implementation based on example from Doug Lea's ["The java.util.concurrent Synchronizer Framework"](http://gee.cs.oswego.edu/dl/papers/aqs.pdf).

## Usage

```clj
(import '(mutex Mutex))
(let [lock (Mutex.)]
  (.lock lock)
  (try
    ;; do stuff
    (finally
     (.unlock lock)))))
```

## License

Copyright 2013 Relevance, Inc.

Distributed under the Eclipse Public License, the same as Clojure.
