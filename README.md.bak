#this is a python like script language written in java using antlr4

build antlr parser/lexers:
```shell
    java -jar libs/antlr4-4.8-1-complete.jar -visitor -no-listener PythonLike.g4 -o src/com/sainttheana/pythonlike/antlr4/
```

run test:
```shell
    make run
```

example code:
```python
def main(args):
    testMethod(args[0])
    testObject()
    testWhile()
    testForeach(args)
    testFor(args)

def testMethod(in):
    print(in)
    
def testObject():
    import org.json.JSONObject
    json=new JSONObject()
    json.put("hello","world")
    print(json.toString())

def print(in):
    import java.lang.System
    System.out.println(in)

def testWhile():
    i=0
    while(i<10):
        print(i)
        i++
    while(i<20):
        print(i)
        i+=1

def testForeach(args):
    for(arg:args):
        print(arg)

def testFor(args):
    argSize=arraySize(args)
    for(i=0;i<argSize;i+=1){
        print(args[i])
    }
    for(i=0;i<argSize;i++){
        print(args[i])
    }

def arraySize(array):
    import java.lang.reflect.Array
    return Array.getLength(array);
```