// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.layout

import yfiles.lang.ClassMetadata

/**
 * [PartitionLayout] provides a framework for layouts that are based on a divide and conquer approach.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PartitionLayout">Online Documentation</a>
 * 
 * @constructor Creates a new [PartitionLayout] instance with default settings.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PartitionLayout%23PartitionLayout-constructor-PartitionLayout">Online Documentation</a>
 */
external open class PartitionLayout  () : LayoutStageBase {

/**
 * Gets or sets the [IPartitionInterEdgeRouter] instance that is responsible for inter-edge routing.
 * 
 * Default value - `null`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PartitionLayout%23interEdgeRouter">Online Documentation</a>
 */
open var interEdgeRouter: IPartitionInterEdgeRouter?
/**
 * Gets or sets the [IPartitionFinder] instance that is responsible for partitioning the input graph.
 * 
 * Default value - `null`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PartitionLayout%23partitionFinder">Online Documentation</a>
 */
open var partitionFinder: IPartitionFinder?
/**
 * Gets or sets the [IPartitionPlacer] instance that is responsible for arranging the graph partitions.
 * 
 * Default value - `null`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PartitionLayout%23partitionPlacer">Online Documentation</a>
 */
open var partitionPlacer: IPartitionPlacer?
/**
 * Arranges and places independent partitions in the graph.
 * @throws InvalidOperationError if the [partition finder][partitionFinder] is `null`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PartitionLayout%23PartitionLayout-method-applyLayout">Online Documentation</a>
 */
 override   fun applyLayout( graph: LayoutGraph )

companion object : ClassMetadata<PartitionLayout> {
/**
 * Creates a [IPartitionPlacer] that uses [ComponentLayout] to place the partitions.
 * @param [componentLayout] An optional [ComponentLayout] to use.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PartitionLayout%23PartitionLayout-method-createComponentPartitionPlacer">Online Documentation</a>
 */
 final   fun createComponentPartitionPlacer( componentLayout: ComponentLayout?  = definedExternally):IPartitionPlacer
/**
 * Creates a [IPartitionFinder] that uses [Groups.edgeBetweennessClustering][yfiles.algorithms.Groups.edgeBetweennessClustering] as strategy for finding graph partitions.
 * @param [minimumPartitionCount] The minimum number of partitions the result should have.
 * @param [maximumPartitionCount] The maximum number of partitions the result should have.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PartitionLayout%23PartitionLayout-method-createEdgeBetweennessPartitionFinder">Online Documentation</a>
 */
 final   fun createEdgeBetweennessPartitionFinder( minimumPartitionCount: Int  = definedExternally,
 maximumPartitionCount: Int  = definedExternally):IPartitionFinder
}
}

inline fun PartitionLayout(
    block: PartitionLayout.() -> Unit
): PartitionLayout {
    return PartitionLayout()
        .apply(block)
}
