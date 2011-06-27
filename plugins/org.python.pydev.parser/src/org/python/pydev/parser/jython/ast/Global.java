// Autogenerated AST node
package org.python.pydev.parser.jython.ast;

public final class Global extends stmtType {
    public NameTokType[] names;
    public exprType value;

    public Global(NameTokType[] names, exprType value) {
        this.names = names;
        this.value = value;
    }


    public Global createCopy() {
        return createCopy(true);
    }
    public Global createCopy(boolean copyComments) {
        NameTokType[] new0;
        if(this.names != null){
        new0 = new NameTokType[this.names.length];
        for(int i=0;i<this.names.length;i++){
            new0[i] = (NameTokType) (this.names[i] != null?
            this.names[i].createCopy(copyComments):null);
        }
        }else{
            new0 = this.names;
        }
        Global temp = new Global(new0, value!=null?(exprType)value.createCopy(copyComments):null);
        temp.beginLine = this.beginLine;
        temp.beginColumn = this.beginColumn;
        if(this.specialsBefore != null && copyComments){
            for(Object o:this.specialsBefore){
                if(o instanceof commentType){
                    commentType commentType = (commentType) o;
                    temp.getSpecialsBefore().add(commentType.createCopy(copyComments));
                }
            }
        }
        if(this.specialsAfter != null && copyComments){
            for(Object o:this.specialsAfter){
                if(o instanceof commentType){
                    commentType commentType = (commentType) o;
                    temp.getSpecialsAfter().add(commentType.createCopy(copyComments));
                }
            }
        }
        return temp;
    }

    public String toString() {
        StringBuffer sb = new StringBuffer("Global[");
        sb.append("names=");
        sb.append(dumpThis(this.names));
        sb.append(", ");
        sb.append("value=");
        sb.append(dumpThis(this.value));
        sb.append("]");
        return sb.toString();
    }

    public Object accept(VisitorIF visitor) throws Exception {
        return visitor.visitGlobal(this);
    }

    public void traverse(VisitorIF visitor) throws Exception {
        if (names != null) {
            for (int i = 0; i < names.length; i++) {
                if (names[i] != null){
                    names[i].accept(visitor);
                }
            }
        }
        if (value != null){
            value.accept(visitor);
        }
    }

}
