// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.router

import yfiles.algorithms.YRectangle
import yfiles.collections.IList
import yfiles.lang.ClassMetadata

/**
 * This class describes an [IObstaclePartition] that decomposes its area dynamically.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DynamicObstacleDecomposition">Online Documentation</a>
 * 
 * @constructor Constructs a new instance of [DynamicObstacleDecomposition].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DynamicObstacleDecomposition%23DynamicObstacleDecomposition-constructor-DynamicObstacleDecomposition">Online Documentation</a>
 */
external open class DynamicObstacleDecomposition  () : IObstaclePartition, IDynamicDecomposition {

/**
 * Gets the bounds of the original rectangular area that is being partitioned.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DynamicObstacleDecomposition%23bounds">Online Documentation</a>
 */
override val bounds: YRectangle
/**
 * Gets or sets the costs incurred for every [Obstacle] that must be cut in a subdivision.
 * 
 * Default value - `8`
 * @throws ArgumentError if the cost is negative
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DynamicObstacleDecomposition%23cutObstacleCost">Online Documentation</a>
 */
open var cutObstacleCost: Double
/**
 * Gets or sets the costs incurred if the distribution after a subdivision of obstacles is unbalanced in sub-cells.
 * 
 * Default value - `2`
 * @throws ArgumentError if the cost is negative
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DynamicObstacleDecomposition%23unbalancedObstaclesCost">Online Documentation</a>
 */
open var unbalancedObstaclesCost: Double
/**
 * Gets or sets the costs incurred if the subdivision produces unbalanced rectangles.
 * 
 * Default value - `2`
 * @throws ArgumentError if the cost is negative
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DynamicObstacleDecomposition%23unbalancedRatioCost">Online Documentation</a>
 */
open var unbalancedRatioCost: Double
/**
 * Adds the given [dynamic decomposition listener][IDecompositionListener] to receive [PartitionCell] subdivision and creation events from this decomposition.
 * @param [listener] the dynamic decomposition listener to add
 * @see [IDecompositionListener]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DynamicObstacleDecomposition%23DynamicObstacleDecomposition-method-addDynamicDecompositionListener">Online Documentation</a>
 */
 override   fun addDynamicDecompositionListener( listener: IDecompositionListener )
/**
 * Clears the partition data such that the [DynamicObstacleDecomposition] can be reused and [initialized][init] with new [Obstacle]s.
 * @see [init]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DynamicObstacleDecomposition%23DynamicObstacleDecomposition-method-clear">Online Documentation</a>
 */
 override   fun clear()
/**
 * Notifies all registered [dynamic decomposition listeners][IDecompositionListener] that the given [partition cell][PartitionCell] has been created.
 * @param [createdCell] the newly created cell
 * @see [IDecompositionListener]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DynamicObstacleDecomposition%23DynamicObstacleDecomposition-method-fireCreateCellEvent">Online Documentation</a>
 */
 open protected   fun fireCreateCellEvent( createdCell: PartitionCell )
/**
 * Notifies all registered [dynamic decomposition listeners][IDecompositionListener] that the given [partition cell][PartitionCell] has been finalized.
 * @param [finalizedCell] the cell that has been finalized
 * @see [IDecompositionListener]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DynamicObstacleDecomposition%23DynamicObstacleDecomposition-method-fireFinalizeCellEvent">Online Documentation</a>
 */
 open protected   fun fireFinalizeCellEvent( finalizedCell: PartitionCell )
/**
 * Notifies all registered [dynamic decomposition listeners][IDecompositionListener] of a subdivision of a given [partition cell][PartitionCell].
 * @param [cell] the cell that has been subdivided
 * @param [subCells] the new sub-cells resulting from the subdivision of the given cell
 * @see [IDecompositionListener]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DynamicObstacleDecomposition%23DynamicObstacleDecomposition-method-fireSubdividedEvent">Online Documentation</a>
 */
 open protected   fun fireSubdividedEvent( cell: PartitionCell ,
 subCells: IList<out PartitionCell> )
/**
 * Notifies all registered [dynamic decomposition listeners][IDecompositionListener] that the given [partition cell][PartitionCell] is unlocked again.
 * @param [unlockedCell] the cell that has been unlocked
 * @see [IDecompositionListener]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DynamicObstacleDecomposition%23DynamicObstacleDecomposition-method-fireUnlockCellEvent">Online Documentation</a>
 */
 open protected   fun fireUnlockCellEvent( unlockedCell: PartitionCell )
/**
 * Returns a list of all [PartitionCell]s that intersect or cover the given rectangle.
 * @param [rect] the rectangular area whose (partially) covered cells will be returned
 * @return a list of [PartitionCell]s that (partially) cover the given rectangular area
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DynamicObstacleDecomposition%23DynamicObstacleDecomposition-method-getCells">Online Documentation</a>
 */
 override   fun getCells( rect: YRectangle ):IList<out PartitionCell>
/**
 * Returns all [partition cells][PartitionCell] that are completely covered by the given [Obstacle].
 * @param [obstacle] the obstacle for which the covered cells will be returned
 * @return list of [PartitionCell] instances that are completely covered by the given obstacle
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DynamicObstacleDecomposition%23DynamicObstacleDecomposition-method-getCellsForObstacle">Online Documentation</a>
 */
 override   fun getCellsForObstacle( obstacle: Obstacle ):IList<out PartitionCell>
/**
 * Calculates the cost of a cut with respect to the geometry of the sub-cells.
 * @param [cut] the coordinate of the cut
 * @param [min] the left side of the subdivided cell
 * @param [max] the right side of the subdivided cell
 * @param [orthogonalMin] the upper side of the subdivided cell
 * @param [orthogonalMax] the lower side of the subdivided cell
 * @return the cost of a cut with respect to the geometry of the sub-cells
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DynamicObstacleDecomposition%23DynamicObstacleDecomposition-method-getGeometricCutCosts">Online Documentation</a>
 */
 open protected   fun getGeometricCutCosts( cut: Double ,
 min: Double ,
 max: Double ,
 orthogonalMin: Double ,
 orthogonalMax: Double ):Double
/**
 * Returns the neighbor [partition cells][PartitionCell] of the given cell.
 * @param [cell] the cell whose neighbors will be returned
 * @return the neighbor cells of the given cell
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DynamicObstacleDecomposition%23DynamicObstacleDecomposition-method-getNeighbors">Online Documentation</a>
 */
 override   fun getNeighbors( cell: PartitionCell ):IList<out PartitionCell>
/**
 * Calculates the cost of a cut with respect to the subdivided obstacles.
 * @param [numObstaclesInFirstHalf] the number of obstacles that lie completely in the first half
 * @param [numObstaclesInSecondHalf] the number of obstacles that lie completely in the second half
 * @param [numObstaclesOnCut] the number of obstacles that lie on the cut
 * @return the cost of a cut with respect to the subdivided obstacles
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DynamicObstacleDecomposition%23DynamicObstacleDecomposition-method-getObstacleCutCosts">Online Documentation</a>
 */
 open protected   fun getObstacleCutCosts( numObstaclesInFirstHalf: Int ,
 numObstaclesInSecondHalf: Int ,
 numObstaclesOnCut: Int ):Double
/**
 * Returns all [Obstacle]s that cover the given [partition cell][PartitionCell].
 * @param [cell] the partition cell for which the obstacles will be returned
 * @return an list of [Obstacle] instances that cover the given cell
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DynamicObstacleDecomposition%23DynamicObstacleDecomposition-method-getObstacles">Online Documentation</a>
 */
 override   fun getObstacles( cell: PartitionCell ):IList<out Obstacle>
/**
 * Initializes this [DynamicObstacleDecomposition] instance with the given obstacles and partition bounds.
 * @param [obstacles] a list of [Obstacle] objects
 * @param [bounds] the bounds of the partition
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DynamicObstacleDecomposition%23DynamicObstacleDecomposition-method-init">Online Documentation</a>
 */
 override   fun init( obstacles: IList<out Obstacle> ,
 bounds: YRectangle )
/**
 * Removes the given [dynamic decomposition listener][IDecompositionListener] such that it no longer receives [PartitionCell] subdivision and creation events from this decomposition.
 * @param [listener] the dynamic decomposition listener to remove
 * @see [IDecompositionListener]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DynamicObstacleDecomposition%23DynamicObstacleDecomposition-method-removeDynamicDecompositionListener">Online Documentation</a>
 */
 override   fun removeDynamicDecompositionListener( listener: IDecompositionListener )

companion object : ClassMetadata<DynamicObstacleDecomposition> {
}
}

inline fun DynamicObstacleDecomposition(
    block: DynamicObstacleDecomposition.() -> Unit
): DynamicObstacleDecomposition {
    return DynamicObstacleDecomposition()
        .apply(block)
}
