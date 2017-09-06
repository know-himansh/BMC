Collection<Ref> refs = Git.lsRemoteRepository()
            .setHeads(true)
            .setRemote(https://github.com/know-himansh/BMC.git)
            .call();

    for (Ref ref : refs) {
        System.out.println("Ref: " + ref);
    }
