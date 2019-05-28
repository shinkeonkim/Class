#include <iostream>
using namespace std;
int N,Cnt=1;
void print(int X,int Y)
{
    cout<<X<<" "<<Y<<"\n";
}
void f(int n,int start,int by,int end)
{
    Cnt++;
    if(n==1)
    {
        print(start,end);
    }
    else
    {
        f(n-1,start,end,by);
        print(start,end);
        f(n-1,by,start,end);
    }
    
}
int main()
{
    cin>>N;
    cout<< (Cnt<<N)-1 <<"\n";
    f(N,1,2,3);
}