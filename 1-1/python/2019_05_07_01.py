def mutableArgument(names):
    names.append("Bob")
    names.sort()
    print("In the func. : ", names)

#main Program
pNames=["Dave","Alice"]
print("Before the func.: ",pNames)
mutableArgument(pNames)
print("After the func.: ",pNames)
