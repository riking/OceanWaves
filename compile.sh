JARS=~/.minecraft/bin/*.jar
CLASSPATH=""
for j in $JARS
	do
	CLASSPATH=$CLASSPATH$j":"
	done
CLASSPATH=${CLASSPATH%?}
javac -cp $CLASSPATH -d out/ -Xmaxerrs 5 src/*.java

