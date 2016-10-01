package Modelo;

public class Dlist {

    private Dnode firstNode;
    private Dnode lastNode;
    private int longitud;

    public Dlist() {
        this.firstNode = null;
        this.lastNode = null;
    }

    public Dnode getFirstNode() {
        return firstNode;
    }

    public Dnode getLastNode() {
        return lastNode;
    }

    public void setFirstNode(Dnode firstNode) {
        this.firstNode = firstNode;
    }

    public void setLastNode(Dnode lastNode) {
        this.lastNode = lastNode;
    }

    public boolean isTheEnd(Dnode x) {
        return (x == null);
    }

    public boolean isEmpty() {
        return (firstNode == null);
    }

    public int getLongitud() {
        return longitud;
    }

    public void setLongitud(int longitud) {
        longitud = longitud;
    }

    //Métodos de insercion
    public void insert(Object d, Dnode y) {
        Dnode x, q;
        x = new Dnode(d);
        connect(x, y);
        longitud++;
    }

    public Dnode whereInsert(Object d) {
        Dnode p, y;
        p = getFirstNode();
        y = p.getLi();

        while (!(isTheEnd(p)) && (char) p.getDato() < (char) d) {
            y = p;
            p = p.getLd();
        }
        return y;
    }
    
    public void insertLast(Dnode x){
        if (isEmpty()) {
            firstNode = x;
            lastNode = x;
            return;
        }        
        x.setLi(lastNode);
        lastNode.setLd(x);
        lastNode = x;
    }
    
    

    public void connect(Dnode x, Dnode y) {
   
        if (y == null)//Insercion al principio
        {
            x.setLd(firstNode);
            if (firstNode != null) {
                firstNode.setLi(x);
            } else {
                lastNode = x;
            }
            firstNode = x;
            return;
        }
        if (y.getLd() == null)//Insercion al final
        {
            y.setLd(x);
            x.setLi(y);
            lastNode = x;
            return;

        } else{ //Insercion en la mitad

        x.setLd(y.getLd());
        y.setLd(x);
        x.setLi(y);
        x.getLd().setLi(x);
        }
    }

    public void insertFirst(Dnode x) {
        if (!isEmpty()) {
            x.setLd(firstNode);
            firstNode.setLi(x);
            firstNode = x;
        }

    }

    public void disconnect(Dnode x) {
     if(x.getLi()==null)
     {
         firstNode=x.getLd();
         
         if(firstNode==null)
         {
             lastNode=null;
         }
         else
         {
             firstNode.setLi(null);
         }
         
     }
     
     else if(x.getLd()==null)
     {
         lastNode=x.getLi();
         lastNode.setLd(null);
     }
     
     else
     {
         x.getLd().setLi(x.getLi());
         x.getLi().setLd(x.getLd());
     }
     
     
      
    }

    public String imprimirLd() {
        Dnode p;
        String d = "";
        p = getFirstNode();

        while (!(isTheEnd(p))) {
            System.out.print(p.getDato() + "--> ");
            d = d + " " + p.getDato();
            p = p.getLd();
        }
        System.out.println("");
        return d + "\n";
    }

    public void ordenarLIsta() {
        Dnode p, menor, q,l;
        p = getFirstNode();
        while (p != getLastNode()) {
            menor = p;
            q = p.getLd();
            while (!(isTheEnd(q))) {
                if ((char) q.getDato() < (char) menor.getDato()) {
                    menor = q;
                }
                q = q.getLd();
            }

            if (menor == p) {
                p = p.getLd();
            } else {
                disconnect(menor);
                //connect(menor, p.getLi());
                l=new Dnode(menor.getDato());
                connect(l,p.getLi());

            }
        }

        System.out.println(this.lastNode.getDato());
        
    }

    /**
     * Copia de la lista
     *
     * @return Retorna un objeto lista doblemente ligada que es la copia de la
     * lista que lo invocó
     */
    public Dlist copy() {
        Dnode p = firstNode;
        Dlist copia = new Dlist();
        Dnode q;

        while (!isTheEnd(p)) {
            copia.insert(p.getDato(), this.getLastNode());
            p = p.getLd();
        }
        return copia;
    }

    public Dnode findNode(int i) {
        Dnode p;
        int pos, k, m;
        k = 1;
        m = longitud / 2;
        if (i >= m) {
            p = getLastNode();
            pos = longitud - i;

            while (k <= pos) {
                p = p.getLi();
                k++;
            }
            return p;
        } else {
            p = getFirstNode();
            while (k < i) {
                p = p.getLd();
                k++;
            }
            return p;
        }

    }

}
