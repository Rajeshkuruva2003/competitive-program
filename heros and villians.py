n=int(input())
m=int(input())
h=int(input())
villians=[int(input()) for _ in range(n)]
start=0
while start<=n:
    i=start
    hea=h
    hero=m
while i<n and m>0:
    v=villians[i]
    if hea>v:
        hea-=v 
        i+=1
    elif hea<v:
        hero-=1
        hea=h
        
    else:
       hero-=1
       i+=1
       hea=h
if i==n:
    break;
start+=1   
```

print(start)   
