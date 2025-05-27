// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.router

import yfiles.algorithms.Node
import yfiles.algorithms.YRectangle
import yfiles.collections.IList
import yfiles.lang.ClassMetadata

/**
 * A [GraphPartition] partitions the bounding box of a graph into rectangles using the graph elements as [Obstacle]s.
 * @see [IGraphPartitionExtension]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphPartition">Online Documentation</a>
 * 
 * @constructor Creates a new [GraphPartition] instance using the given [delegate inner obstacle partition][partition].
 * @param [partition] the delegate inner obstacle partition
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphPartition%23GraphPartition-constructor-GraphPartition">Online Documentation</a>
 * 
 * @property partition
 * Gets the delegate inner obstacle partition.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphPartition%23partition">Online Documentation</a>
 */
external open class GraphPartition  (
protected open val partition: IObstaclePartition) : IPartition, IDynamicDecomposition, IDecompositionListener {

/**
 * Gets the bounds of the original rectangular area that is being partitioned.
 * @see [IPartition.bounds]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphPartition%23bounds">Online Documentation</a>
 */
override val bounds: YRectangle
/**
 * Adds the given listener to the [GraphPartition].
 * @param [listener] the listener to be added
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphPartition%23GraphPartition-method-addDynamicDecompositionListener">Online Documentation</a>
 */
 override   fun addDynamicDecompositionListener( listener: IDecompositionListener )
/**
 * Clears the [partition][GraphPartition] data such that the [GraphPartition] can be reused and [initialized][init] with a new configuration.
 * @see [init]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphPartition%23GraphPartition-method-clear">Online Documentation</a>
 */
 open   fun clear()
/**
 * Creates and returns a new [Obstacle] using the given bounds and data.
 * @param [bounds] the bounds of the obstacle
 * @param [data] the additional data that should be associated with the obstacle
 * @return a new [Obstacle] using the given bounds and data
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphPartition%23GraphPartition-method-createObstacle">Online Documentation</a>
 */
 open   fun createObstacle( bounds: YRectangle ,
 data: ObstacleData ):Obstacle
/**
 * Returns a list of all [PartitionCell]s that intersect or cover the given rectangle by delegating to the corresponding method of the [inner partition][partition].
 * @param [rect] the rectangular area whose (partially) covered cells will be returned
 * @return a list containing (partially) covered [PartitionCell]s
 * @see [IPartition.getCells]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphPartition%23GraphPartition-method-getCells">Online Documentation</a>
 */
 override   fun getCells( rect: YRectangle ):IList<out PartitionCell>
/**
 * Returns all [PartitionCell]s that are completely covered by the bounds of the given node.
 * @param [node] the node for which the covered cells will be returned
 * @return a list of [PartitionCell] instances that are completely covered by the bounds of the given node
 * @throws ArgumentError if the node is unknown
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphPartition%23GraphPartition-method-getCellsForNode">Online Documentation</a>
 */
 open   fun getCellsForNode( node: Node ):IList<out PartitionCell>
/**
 * Returns a list of all [PartitionCell]s that are neighbors of the given cell, i.e., those cells that have a common border segment with the given cell.
 * @param [cell] the cell whose neighbors will be returned
 * @return a list of [PartitionCell]s that are neighbors of the given cell
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphPartition%23GraphPartition-method-getNeighbors">Online Documentation</a>
 */
 override   fun getNeighbors( cell: PartitionCell ):IList<out PartitionCell>
/**
 * Returns a list of all [Node]s whose bounds intersect or cover the bounds of the given cell.
 * @param [cell] the cell
 * @return a list of [Node]s that are intersected by the given cell
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphPartition%23GraphPartition-method-getNodes">Online Documentation</a>
 */
 open   fun getNodes( cell: PartitionCell ):IList<out Node>
/**
 * Returns the [Obstacle] that has been created earlier for the given data object.
 * @param [data] the given data for which the obstacle will be returned
 * @return the [Obstacle] that has been created earlier for the given data object
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphPartition%23GraphPartition-method-getObstacle">Online Documentation</a>
 */
 open   fun getObstacle( data: ObstacleData ):Obstacle
/**
 * Returns all [Obstacle]s covering the given [PartitionCell] by delegating to the corresponding method of the [inner partition][partition].
 * @param [cell] the cell whose obstacles will be returned
 * @return a list of [Obstacle]s that cover the given cell
 * @see [IObstaclePartition.getObstacles]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphPartition%23GraphPartition-method-getObstacles">Online Documentation</a>
 */
 open   fun getObstacles( cell: PartitionCell ):IList<out Obstacle>
/**
 * Initializes the [GraphPartition] with the given graph instance based on the given [configuration][PathSearchConfiguration] used by path search algorithms.
 * @param [configuration] the configuration used by path search algorithms
 * @see [clear]
 * @see [IGraphPartitionExtension.preparePartition]
 * @see [addDynamicDecompositionListener]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphPartition%23GraphPartition-method-init">Online Documentation</a>
 */
 open   fun init( configuration: PathSearchConfiguration )
/**
 * Re-dispatches the event of the creation of a new [PartitionCell] to all registered [IDecompositionListener]s.
 * @param [createdCell] the newly created [PartitionCell]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphPartition%23GraphPartition-method-onCellCreated">Online Documentation</a>
 */
 override   fun onCellCreated( createdCell: PartitionCell )
/**
 * Re-dispatches the event of having completed the process of subdivisions of a given [PartitionCell] to all registered [IDecompositionListener]s.
 * @param [finalizedCell] the cell that has been finalized
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphPartition%23GraphPartition-method-onCellFinalized">Online Documentation</a>
 */
 override   fun onCellFinalized( finalizedCell: PartitionCell )
/**
 * Re-dispatches the event of the subdivision of a given [PartitionCell] into several sub-cells to all registered [IDecompositionListener]s.
 * @param [cell] the cell that has been subdivided
 * @param [subCells] the sub-cells resulting from the subdivision of the given [PartitionCell]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphPartition%23GraphPartition-method-onCellSubdivided">Online Documentation</a>
 */
 override   fun onCellSubdivided( cell: PartitionCell ,
 subCells: IList<out PartitionCell> )
/**
 * Re-dispatches the event of having unlocked a previously [finalized][onCellFinalized] [PartitionCell] to all registered [IDecompositionListener]s.
 * @param [unlockedCell] the cell that has been unlocked
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphPartition%23GraphPartition-method-onCellUnlocked">Online Documentation</a>
 */
 override   fun onCellUnlocked( unlockedCell: PartitionCell )
/**
 * Removes the given listener from the [GraphPartition].
 * @param [listener] the listener to be removed
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphPartition%23GraphPartition-method-removeDynamicDecompositionListener">Online Documentation</a>
 */
 override   fun removeDynamicDecompositionListener( listener: IDecompositionListener )

companion object : ClassMetadata<GraphPartition> {
}
}
