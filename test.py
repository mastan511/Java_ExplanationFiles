import re
def replaceword():
    with open(filepath,'r') as f:
        data = f.read()
        d=data.replace(word,rep)
        print(d)
    with open(filepath,'w')as f:
        f.write(d)
word=input()
rep=input()
filepath = 'DataFiles/newfile.txt'
replaceword()