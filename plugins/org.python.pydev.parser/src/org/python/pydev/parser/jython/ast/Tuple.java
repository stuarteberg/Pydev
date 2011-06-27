// Autogenerated AST node
package org.python.pydev.parser.jython.ast;

public final class Tuple extends exprType implements expr_contextType {
    public exprType[] elts;
    public int ctx;
    public boolean endsWithComma;

    public Tuple(exprType[] elts, int ctx, boolean endsWithComma) {
        this.elts = elts;
        this.ctx = ctx;
        this.endsWithComma = endsWithComma;
    }


    public Tuple createCopy() {
        return createCopy(true);
    }
    public Tuple createCopy(boolean copyComments) {
        exprType[] new0;
        if(this.elts != null){
        new0 = new exprType[this.elts.length];
        for(int i=0;i<this.elts.length;i++){
            new0[i] = (exprType) (this.elts[i] != null? this.elts[i].createCopy(copyComments):null);
        }
        }else{
            new0 = this.elts;
        }
        Tuple temp = new Tuple(new0, ctx, endsWithComma);
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
        StringBuffer sb = new StringBuffer("Tuple[");
        sb.append("elts=");
        sb.append(dumpThis(this.elts));
        sb.append(", ");
        sb.append("ctx=");
        sb.append(dumpThis(this.ctx, expr_contextType.expr_contextTypeNames));
        sb.append(", ");
        sb.append("endsWithComma=");
        sb.append(dumpThis(this.endsWithComma));
        sb.append("]");
        return sb.toString();
    }

    public Object accept(VisitorIF visitor) throws Exception {
        return visitor.visitTuple(this);
    }

    public void traverse(VisitorIF visitor) throws Exception {
        if (elts != null) {
            for (int i = 0; i < elts.length; i++) {
                if (elts[i] != null){
                    elts[i].accept(visitor);
                }
            }
        }
    }

}
