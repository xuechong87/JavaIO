
'''
Created on 2013-11-17
build json
@author: xuechong87
'''

import os

if __name__ == "__main__":
    result = "["
    basePath  = os.getcwd()
    listPart = sorted(list(str(f).find("Part")==0 and f or '' for f in os.listdir(basePath)))
    
    for parts in listPart:
        if parts:
            
            chapList = sorted(os.listdir(basePath + os.sep + parts))
            
            for chap in chapList:
                result += '\t{\n\t"chap":"' + str(chap) + '",\n'
                result += '\t"basePath":"'+ parts +'/' + str(chap) + '",\n'
                result += '\t"contents":['
                for htm in os.listdir(basePath + os.sep + parts + os.sep + chap):
                    if(str(htm)).find(".html")>0:
                        result += '\t{"title":"'+ str(htm)[:len(htm)-5] +'"}\n,'
                        
                result = result[:len(result)-1]
                result += "]\n"
                result += "}\n,"
                
    result = result[:len(result)-1]     
    result += "]"   
    print(result)
    contents = open(basePath + os.sep + "contents.json",'w')        
    contents.write(result);
    contents.close()

    print ("OK")
    input("end")
    pass
        
        
        
        
            