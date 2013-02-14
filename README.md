Macker examples
===============

**macker-example** is a maven project showing how you can enforce architectural rules with [Macker](http://innig.net/macker/).  
It is based on [MackerMavenPlugin](http://code.google.com/p/code-cop-code/wiki/MackerMavenPlugin) made by Peter Kofler.

It shows several kind of rules : 
* layered architecture rule by denying access to database from views.  
* package rule constraints for domain classes.
* forbid usage of java.lang.Vector.

The project does not compile on purpose to show Macker rules violations (macker being executed at compile phaseby default).

The macker [documentation](http://www.innig.net/macker/guide/index.html) is quite good, it is worth reading it.

Lastly, note that to use MackerMavenPlugin, you must add code-cop-code maven plugin repo, the official macker maven plugin is in codehaus but has not been released officialy.

