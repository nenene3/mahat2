package summer_2021_a.ex1;

public class Store {


    private Tablet[] tablets;
    private int[] systems;

    public Tablet[] getTablets() {
        return tablets;
    }

    public void setTablets(Tablet[] tablets) {
        this.tablets = tablets;
    }

    public int[] getSystems() {
        return systems;
    }

    public void setSystems(int[] systems) {
        this.systems = systems;
    }

    public Store() {
        this.tablets = new Tablet[1000];
        this.systems = new int[3];
    }

    public boolean addTablet(Tablet tab) {
        int count = this.systems[0] + this.systems[1] + this.systems[2];
        if (count >= 1000)
            return false;
        for (int i = 0; i < count; i++) {
            if (tab.isSame(this.tablets[i])) {
                if (tab.getPrice() > this.tablets[i].getPrice())
                    this.tablets[i].setPrice(tab.getPrice());
                return true;
            }
        }
        this.tablets[count] = tab;
        switch (tab.getType()) {
            case 'w':
                this.systems[0]++;
                break;
            case 'A':
                this.systems[1]++;
                break;
            case 'I':
                this.systems[2]++;
                break;
        }
        return true;
    }
    public int sortStore(){
        //too lazy to do bubble sort with switch case for all swap cases
        int count = this.systems[0] + this.systems[1] + this.systems[2];
        int start=0;
        int end=count-1;
        int between=this.systems[0];

        Tablet[] tmp = new Tablet[1000];
        for(int i=0;i<count;i++){
            switch (this.tablets[i].getType()) {
                case 'w':
                    tmp[start++]=this.tablets[i];
                    break;
                case 'A':
                    tmp[between++]=this.tablets[i];
                    break;
                case 'I':
                    tmp[end--]=this.tablets[i];
                    break;
            }
        }
        this.tablets=tmp;
        return 1000-this.systems[0]-this.systems[1]-this.systems[2];
    }
}
