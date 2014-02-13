all:
	make minijava/parser
	make rest

minijava/parser: grammar
	rm -rf minijava/parser minijava/node minijava/lexer minijava/analysis
	java -cp ../sablecc-3.2amh/src org.sablecc.sablecc.SableCC grammar

rest:
	make classclean
	javac -Xlint:unchecked minijava/Main2.java

clean:
	make classclean

distclean:
	rm -rf minijava/parser minijava/node minijava/lexer minijava/analysis
	make classclean

classclean:
	find minijava -name '*.class' -exec rm {} \;

backupfileclean:
	find . -name '*~' -exec rm {} \;
