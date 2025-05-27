// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.router

import yfiles.lang.InterfaceMetadata

/**
 * This interface provides methods for extending the functionality of a [GraphPartition].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IGraphPartitionExtension">Online Documentation</a>
 */
external interface IGraphPartitionExtension : IDecompositionListener {
/**
 * Cleans up the extension from the last partitioning with the current [configuration][PathSearchConfiguration] and [GraphPartition].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IGraphPartitionExtension%23IGraphPartitionExtension-method-cleanUp">Online Documentation</a>
 */
   fun cleanUp()
/**
 * Adds a [IGraphPartitionExtension] to the [GraphPartition].
 * @param [configuration] the configuration used for the path search
 * @param [graphPartition] the graph partition that uses this extension
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IGraphPartitionExtension%23IGraphPartitionExtension-method-preparePartition">Online Documentation</a>
 */
   fun preparePartition( configuration: PathSearchConfiguration ,
 graphPartition: GraphPartition )

companion object : InterfaceMetadata<IGraphPartitionExtension> {
}
}
