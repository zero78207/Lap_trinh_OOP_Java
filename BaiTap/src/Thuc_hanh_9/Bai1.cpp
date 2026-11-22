#include <iostream>
#include <utility>
using namespace std;
#define MAX 100
struct Element{
    char data;
    int priority;
};
struct PriorityQueue{
    Element arr[MAX];
    int size;
};
void siftUp(PriorityQueue *q){
    int i, p;
    i = q->size - 1;
    while(i > 0){
        p = (i - 1)/2;
        if(q->arr[p].priority < q->arr[i].priority){
            swap(q->arr[p], q->arr[i]);
            i = p;
        }else
            return;
    }
}
bool add(PriorityQueue *p, Element x){
    if(p->size >= MAX)
        return false;
    p->arr[p->size] = x;
    p->size++;
    siftUp(p);
    return true;
}
void siftDown(PriorityQueue *q){
    int p = 0, i = 2*p + 1;
    while(i < q->size){
        if(i + 1 < q->size && q->arr[i].priority < q->arr[i + 1].priority)
            i += 1;
        if(q->arr[p].priority < q->arr[i].priority){
            swap(q->arr[p], q->arr[i]);
            p = i;
            i = 2*p + 1;
        }else return;
    }
}
Element remove(PriorityQueue *q){
    if(q->size == 0)
        return {};
    int n = q->size;
    Element x = q->arr[0];
    q->arr[0] = q->arr[n - 1];
    q->size--;
    siftDown(q);
    return x;
}
bool isEmpty(PriorityQueue q){
    if(q.size == 0)return true;
    else return false;
}
Element top(PriorityQueue q){
    if(!isEmpty(q))
        return q.arr[0];
    return {};
}
int main(){
    PriorityQueue q;
    Element x;
    q.size = 0;
    add(&q, {'A', 3});
    add(&q, {'B', 4});
    add(&q, {'C', 1});
    x = remove(&q);
    cout << x.data << " - " << x.priority << endl;
    if(isEmpty(q)) cout << "Doi tuong trong" << endl;
    else cout << "Doi tuong khong trong" << endl;
}