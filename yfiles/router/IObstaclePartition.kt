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
import yfiles.lang.InterfaceMetadata

/**
 * This class implements a [IPartition] that takes a list of [Obstacle]s as input to subdivide an area into [PartitionCell]s.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IObstaclePartition">Online Documentation</a>
 */
external interface IObstaclePartition : IPartition {
/**
 * Clears the partition data such that the [IObstaclePartition] can be reused and [initialized][init] with new [Obstacle]s.
 * @see [init]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IObstaclePartition%23IObstaclePartition-method-clear">Online Documentation</a>
 */
   fun clear()
/**
 * Returns all [PartitionCell]s that are completely covered by the given [Obstacle].
 * @param [obstacle] the obstacle for which the covered cells will be returned
 * @return a list of [PartitionCell] instances that are completely covered by the given obstacle
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IObstaclePartition%23IObstaclePartition-method-getCellsForObstacle">Online Documentation</a>
 */
   fun getCellsForObstacle( obstacle: Obstacle ):IList<out PartitionCell>
/**
 * Returns all [Obstacle]s that cover the given [PartitionCell].
 * @param [cell] the partition cell for which the obstacles will be returned
 * @return a list of [Obstacle] instances that cover the given cell
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IObstaclePartition%23IObstaclePartition-method-getObstacles">Online Documentation</a>
 */
   fun getObstacles( cell: PartitionCell ):IList<out Obstacle>
/**
 * Initializes a new [IObstaclePartition] of the area with the given bounds using the given list of [Obstacle]s.
 * @param [obstacles] a list of [Obstacle]s that have to be considered by the partition
 * @param [bounds] the bounds of the partition
 * @see [clear]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IObstaclePartition%23IObstaclePartition-method-init">Online Documentation</a>
 */
   fun init( obstacles: IList<out Obstacle> ,
 bounds: YRectangle )

companion object : InterfaceMetadata<IObstaclePartition> {
}
}
