// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.router

import yfiles.collections.IList
import yfiles.lang.ClassMetadata

/**
 * [GraphPartitionExtensionAdapter] provides an empty implementation of [IGraphPartitionExtension].
 * @see [configuration]
 * @see [graphPartition]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphPartitionExtensionAdapter">Online Documentation</a>
 * 
 * @constructor Creates a new instance of [GraphPartitionExtensionAdapter].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphPartitionExtensionAdapter%23GraphPartitionExtensionAdapter-constructor-GraphPartitionExtensionAdapter">Online Documentation</a>
 */
external abstract class GraphPartitionExtensionAdapter  () : IGraphPartitionExtension {

/**
 * Gets the configuration of the [PathSearch] passed to [IGraphPartitionExtension.preparePartition].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphPartitionExtensionAdapter%23configuration">Online Documentation</a>
 */
protected open val configuration: PathSearchConfiguration
/**
 * Gets the [GraphPartition] passed to [IGraphPartitionExtension.preparePartition].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphPartitionExtensionAdapter%23graphPartition">Online Documentation</a>
 */
protected open val graphPartition: GraphPartition
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphPartitionExtensionAdapter%23GraphPartitionExtensionAdapter-method-cleanUp">Online Documentation</a>
 */
 override   fun cleanUp()
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphPartitionExtensionAdapter%23GraphPartitionExtensionAdapter-method-onCellCreated">Online Documentation</a>
 */
 override   fun onCellCreated( createdCell: PartitionCell )
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphPartitionExtensionAdapter%23GraphPartitionExtensionAdapter-method-onCellFinalized">Online Documentation</a>
 */
 override   fun onCellFinalized( finalizedCell: PartitionCell )
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphPartitionExtensionAdapter%23GraphPartitionExtensionAdapter-method-onCellSubdivided">Online Documentation</a>
 */
 override   fun onCellSubdivided( cell: PartitionCell ,
 subCells: IList<out PartitionCell> )
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphPartitionExtensionAdapter%23GraphPartitionExtensionAdapter-method-onCellUnlocked">Online Documentation</a>
 */
 override   fun onCellUnlocked( unlockedCell: PartitionCell )
/**
 * Stores the given [PathSearchConfiguration] and [GraphPartition] such that they are accessible through [configuration] and [graphPartition], respectively.
 * @param [configuration] the configuration used for the path search
 * @param [graphPartition] the graph partition that uses this extension
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphPartitionExtensionAdapter%23GraphPartitionExtensionAdapter-method-preparePartition">Online Documentation</a>
 */
 override   fun preparePartition( configuration: PathSearchConfiguration ,
 graphPartition: GraphPartition )

companion object : ClassMetadata<GraphPartitionExtensionAdapter> {
}
}
