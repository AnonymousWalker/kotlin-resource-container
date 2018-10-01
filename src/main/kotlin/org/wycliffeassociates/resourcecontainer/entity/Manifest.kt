package org.wycliffeassociates.resourcecontainer.entity

import com.fasterxml.jackson.annotation.JsonProperty

class Manifest(
    @JsonProperty("dublin_core")
    var dublinCore: DublinCore,
    var projects: List<Project>,
    var checking: Checking
)

fun manifest(init: Manifest.() -> Unit): Manifest {
        val manifest = Manifest(DublinCore(), arrayListOf(Project()), Checking())
        manifest.init()
        return manifest
}