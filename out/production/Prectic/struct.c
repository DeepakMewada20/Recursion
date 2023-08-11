#include<stdio.h>
union d
{
    char name[5];
    int id;
};
void main(){name={'d','e','e','p','a'};
    union d d1;
    char name[5];
    d1.id=54;
    //d1.name={'d','e','e','p','a'};
    name=['d','e','e','p','a'];
    printf("%d\n",d1.id);
    printf("%s\n",d1.name);
    printf("%s\n",name[0]);
}
