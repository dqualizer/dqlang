package io.github.dqualizer.dqlang.data

import io.github.dqualizer.dqlang.types.dam.architecture.ServiceDescription
import io.github.dqualizer.dqlang.types.dam.architecture.SoftwareSystem
import io.github.dqualizer.dqlang.types.dam.domainstory.Activity
import io.github.dqualizer.dqlang.types.dam.domainstory.Actor
import io.github.dqualizer.dqlang.types.dam.domainstory.DomainStory
import io.github.dqualizer.dqlang.types.dam.domainstory.WorkObject
import io.github.dqualizer.dqlang.types.dam.mapping.DAMapping
import io.github.dqualizer.dqlang.types.rqa.definition.RuntimeQualityAnalysis
import org.springframework.data.mongodb.repository.MongoRepository

// can be removed

//---------- Domain Story
interface DomainStoryRepository : MongoRepository<String, DomainStory>

interface ActorRepository : MongoRepository<String, Actor>

interface WorkObjectRepository : MongoRepository<String, WorkObject>

interface ActivityRepository : MongoRepository<String, Activity>

//----------Mapping
interface MappingRepository : MongoRepository<String, DAMapping<*, *>>

interface RQARepository : MongoRepository<String, RuntimeQualityAnalysis>

//-------Architecture

interface SoftwareSystemRepository : MongoRepository<String, SoftwareSystem>

interface ServiceDescriptionRepository : MongoRepository<String, ServiceDescription>
