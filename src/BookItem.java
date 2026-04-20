
    public boolean checkout(Member member) {
        if (status != BookStatus.AVAILABLE) return false;

        status = BookStatus.LOANED;
        borrowedDate = new Date();
        dueDate = new Date(System.currentTimeMillis() + 7L*24*60*60*1000);

        //member.borrowedBooks.add(this);
        return true;
    }
}