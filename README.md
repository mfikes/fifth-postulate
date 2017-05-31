# fifth-postulate

Test ClojureScript parallel compilation speedup.

This project includes a _lot_ of independent namespaces arranged in a flat hierarchy, each of which is a relatively expensive namespace to compile.

## Running

1. Run `lein clean && lein cljsbuild once single` for a regular build.
2. Run `lein clean && lein cljsbuild once parallel` for a parallel build.

## Results

2 x 2.4 GHz 6-Core Intel Xeon Mac Pro with 128 GB RAM:

```
$ lein clean && lein cljsbuild once single
Compiling ClojureScript...
Compiling "/Users/mfikes/Projects/fifth-postulate/target/cljsbuild-main.js" from ["src"]...
Successfully compiled "/Users/mfikes/Projects/fifth-postulate/target/cljsbuild-main.js" in 1344.308 seconds.
```

```
$ lein clean && lein cljsbuild once parallel
Compiling ClojureScript...
Compiling "/Users/mfikes/Projects/fifth-postulate/target/cljsbuild-main.js" from ["src"]...
Successfully compiled "/Users/mfikes/Projects/fifth-postulate/target/cljsbuild-main.js" in 185.079 seconds.
```

That's approximately a 7x speedup.

Here is a comparison of what the CPUs look like for each run

<img src="cpus.png"/>
