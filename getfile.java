Collection<Ref> refs = Git.lsRemoteRepository()
            .setHeads(true)
            .setRemote()
            .call();

    for (Ref ref : refs) {
        System.out.println("Ref: " + ref);
    }
