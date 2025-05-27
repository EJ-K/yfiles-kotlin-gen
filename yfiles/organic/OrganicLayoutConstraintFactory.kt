// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.organic

import yfiles.collections.IList
import yfiles.lang.ClassMetadata
import yfiles.lang.YObject

/**
 * The [OrganicLayoutConstraintFactory] allows to define additional constraints on subsets of a graph that will be applied by the [OrganicLayout] during the layout calculation.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrganicLayoutConstraintFactory">Online Documentation</a>
 */
external open class OrganicLayoutConstraintFactory  : YObject {

/**
 * Adds constraints that cause the given nodes to align parallel to the specified axis.
 * @param [nodeIds] The IDs of the nodes that should be aligned.
 * @param [axis] [OrganicLayoutConstraintOrientation.HORIZONTAL] to align the nodes parallel to the x-axis, [OrganicLayoutConstraintOrientation.VERTICAL] to align them parallel to the y-axis.
 * @throws ArgumentError if the axis is set to [OrganicLayoutConstraintOrientation.BOTH].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrganicLayoutConstraintFactory%23OrganicLayoutConstraintFactory-method-addAlignmentConstraint(IList,OrganicLayoutConstraintOrientation)">Online Documentation</a>
 */
 open   fun addAlignmentConstraint( nodeIds: IList<out Any> ,
 axis: OrganicLayoutConstraintOrientation )
/**
 * Adds constraints that cause the given nodes to align parallel to the specified axis.
 * @param [nodeIds] The IDs of the nodes that should be aligned.
 * @param [axis] [OrganicLayoutConstraintOrientation.HORIZONTAL] to align the nodes parallel to the x-axis, [OrganicLayoutConstraintOrientation.VERTICAL] to align them parallel to the y-axis.
 * @param [alignmentRange] The maximum axis distance between the centers of any two aligned nodes.
 * @throws ArgumentError if the given alignment range is negative
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrganicLayoutConstraintFactory%23OrganicLayoutConstraintFactory-method-addAlignmentConstraint(IList,OrganicLayoutConstraintOrientation,number)">Online Documentation</a>
 */
 open   fun addAlignmentConstraint( nodeIds: IList<out Any> ,
 axis: OrganicLayoutConstraintOrientation ,
 alignmentRange: Double )
/**
 * Adds constraints that cause the specified nodes to be arranged on the border of an ellipse with the given aspect ratio.
 * @param [nodeIds] the IDs of the nodes that should be placed on the border of an ellipse.
 * @param [regularPlacement] `true` if the nodes should be placed in regular intervals along the border of the ellipse, `false` otherwise.
 * @param [aspectRatio] a positive ratio between the horizontal and vertical diameter of the ellipse, or `0`, if the ratio should be calculated automatically.
 * @throws ArgumentError if the given aspect ratio is negative
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrganicLayoutConstraintFactory%23OrganicLayoutConstraintFactory-method-addEllipse">Online Documentation</a>
 */
 open   fun addEllipse( nodeIds: IList<out Any> ,
 regularPlacement: Boolean ,
 aspectRatio: Double  = definedExternally)
/**
 * Adds constraints to fix the positions of the specified nodes in relation to one another along one coordinate axis.
 * @param [nodeIds] The IDs of the nodes that should be fixed in relation to one another.
 * @param [axis] [OrganicLayoutConstraintOrientation.HORIZONTAL] to fix the distances along the x-axis, [OrganicLayoutConstraintOrientation.VERTICAL] to fix the distances along the y-axis or [OrganicLayoutConstraintOrientation.BOTH] to fix the node's positions relative to each other.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrganicLayoutConstraintFactory%23OrganicLayoutConstraintFactory-method-addFixedDistances">Online Documentation</a>
 */
 open   fun addFixedDistances( nodeIds: IList<out Any> ,
 axis: OrganicLayoutConstraintOrientation )
/**
 * Adds constraints that prevent the specified nodes from occupying an area larger than the defined bounding box.
 * @param [nodeIds] The IDs of the nodes whose bounding box should be limited.
 * @param [width] The maximum width of the bounding box containing all specified nodes.
 * @param [height] The maximum height of the bounding box containing all specified nodes.
 * @throws ArgumentError if width or height is negative.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrganicLayoutConstraintFactory%23OrganicLayoutConstraintFactory-method-addFloatingBoundingBox">Online Documentation</a>
 */
 open   fun addFloatingBoundingBox( nodeIds: IList<out Any> ,
 width: Double ,
 height: Double )
/**
 * Adds constraints that enforce a maximum vertical or horizontal distance between the given nodes.
 * @param [nodeId1] The ID representing the first of the two nodes that are constrained with respect to their maximum distance.
 * @param [nodeId2] The ID representing the second of the two nodes that are constrained with respect to their maximum distance.
 * @param [maximumDistance] The largest allowed horizontal resp. vertical distance between both nodes. The distance is measured between the boundaries of the nodes.
 * @param [axis] The axis that is used for measuring the distance. [OrganicLayoutConstraintOrientation.HORIZONTAL] to restrict the horizontal distance, [OrganicLayoutConstraintOrientation.VERTICAL] to restrict the vertical distance or [OrganicLayoutConstraintOrientation.BOTH] to restrict both.
 * @throws ArgumentError if the maximum distance is negative.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrganicLayoutConstraintFactory%23OrganicLayoutConstraintFactory-method-addMaximumDistanceConstraint">Online Documentation</a>
 */
 open   fun addMaximumDistanceConstraint( nodeId1: Any ,
 nodeId2: Any ,
 maximumDistance: Double ,
 axis: OrganicLayoutConstraintOrientation )
/**
 * Adds constraints that enforce a minimum distance between the given nodes.
 * @param [nodeId1] The ID representing the first of the two nodes that are constrained with respect to their minimum distance.
 * @param [nodeId2] The ID representing the second of the two nodes that are constrained with respect to their minimum distance.
 * @param [minimumDistance] The minimum required distance between the two nodes. The distance is measured between the boundaries of the nodes.
 * @throws ArgumentError if the minimum distance is negative.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrganicLayoutConstraintFactory%23OrganicLayoutConstraintFactory-method-addMinimumDistanceConstraint">Online Documentation</a>
 */
 open   fun addMinimumDistanceConstraint( nodeId1: Any ,
 nodeId2: Any ,
 minimumDistance: Double )
/**
 * Adds constraints that cause the given nodes to be placed along the specified axis in the order they are given.
 * @param [orderedNodeIds] The IDs of the nodes to be placed in the order of their appearance in this list.
 * @param [axis] [OrganicLayoutConstraintOrientation.HORIZONTAL] to order the nodes along the x-axis, [OrganicLayoutConstraintOrientation.VERTICAL] to order them along the y-axis or [OrganicLayoutConstraintOrientation.BOTH] to order them along both axes.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrganicLayoutConstraintFactory%23OrganicLayoutConstraintFactory-method-addOrderConstraint">Online Documentation</a>
 */
 open   fun addOrderConstraint( orderedNodeIds: IList<out Any> ,
 axis: OrganicLayoutConstraintOrientation )
/**
 * Adds constraints that prevent the given nodes from being placed outside the specified rectangle.
 * @param [nodeIds] The IDs of the nodes that should be placed in the specified rectangle.
 * @param [left] The coordinate of the bounding rectangle's left boundary.
 * @param [top] The coordinate of the bounding rectangle's top boundary.
 * @param [width] The width of the bounding rectangle.
 * @param [height] The height of the bounding rectangle.
 * @throws ArgumentError if width or height is negative.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrganicLayoutConstraintFactory%23OrganicLayoutConstraintFactory-method-addPinnedBoundingBox">Online Documentation</a>
 */
 open   fun addPinnedBoundingBox( nodeIds: IList<out Any> ,
 left: Double ,
 top: Double ,
 width: Double ,
 height: Double )
/**
 * Adds constraints that cause the specified nodes to be arranged on the border of a rectangle with the given aspect ratio.
 * @param [nodeIds] the IDs of the nodes that should be placed on the border of a rectangle.
 * @param [aspectRatio] a positive ratio between the width and height of the rectangle, or `0`, if the ratio should be calculated automatically.
 * @throws ArgumentError if the given aspect ratio is negative
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrganicLayoutConstraintFactory%23OrganicLayoutConstraintFactory-method-addRectangle">Online Documentation</a>
 */
 open   fun addRectangle( nodeIds: IList<out Any> ,
 aspectRatio: Double  = definedExternally)
/**
 * Adds constraints that cause the given nodes to be aligned parallel to the specified axis.
 * @param [nodeIds] The IDs of the nodes that should be aligned
 * @param [axis] [OrganicLayoutConstraintOrientation.HORIZONTAL] to align the nodes parallel to the x-axis, [OrganicLayoutConstraintOrientation.VERTICAL] to align them parallel to the y-axis.
 * @throws ArgumentError if the axis is set to [OrganicLayoutConstraintOrientation.BOTH].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrganicLayoutConstraintFactory%23OrganicLayoutConstraintFactory-method-addRegularAlignmentConstraint(IList,OrganicLayoutConstraintOrientation)">Online Documentation</a>
 */
 open   fun addRegularAlignmentConstraint( nodeIds: IList<out Any> ,
 axis: OrganicLayoutConstraintOrientation )
/**
 * Adds constraints that cause the given nodes to be aligned parallel to the specified axis.
 * @param [nodeIds] The IDs of the nodes that should be aligned.
 * @param [axis] [OrganicLayoutConstraintOrientation.HORIZONTAL] to align the nodes parallel to the x-axis, [OrganicLayoutConstraintOrientation.VERTICAL] to align them parallel to the y-axis.
 * @param [distance] The distance between neighbouring nodes along the alignment.
 * @throws ArgumentError if the axis is set to [OrganicLayoutConstraintOrientation.BOTH] or if the given distance is negative
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrganicLayoutConstraintFactory%23OrganicLayoutConstraintFactory-method-addRegularAlignmentConstraint(IList,OrganicLayoutConstraintOrientation,number)">Online Documentation</a>
 */
 open   fun addRegularAlignmentConstraint( nodeIds: IList<out Any> ,
 axis: OrganicLayoutConstraintOrientation ,
 distance: Double )
/**
 * Adds constraints that enforce a minimum distance between two sets of nodes.
 * @param [idSetA] The IDs of the nodes on the left/top side of the division.
 * @param [idSetB] The IDs of the nodes on the right/bottom side of the division.
 * @param [axis] [OrganicLayoutConstraintOrientation.HORIZONTAL] to separate the nodes along the x-axis, [OrganicLayoutConstraintOrientation.VERTICAL] to separate them along the y-axis, [OrganicLayoutConstraintOrientation.BOTH] to separate them along both axes.
 * @param [minimumDistance] The minimum distance by which the two sets are separated.
 * @throws ArgumentError if the minimum distance is negative.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrganicLayoutConstraintFactory%23OrganicLayoutConstraintFactory-method-addSeparationConstraint">Online Documentation</a>
 */
 open   fun addSeparationConstraint( idSetA: IList<out Any> ,
 idSetB: IList<out Any> ,
 axis: OrganicLayoutConstraintOrientation ,
 minimumDistance: Double )
/**
 * Clears all constraints that are currently in this set.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrganicLayoutConstraintFactory%23OrganicLayoutConstraintFactory-method-clear">Online Documentation</a>
 */
 open   fun clear()
/**
 * Removes the constraint factory from the graph it has been attached to.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrganicLayoutConstraintFactory%23OrganicLayoutConstraintFactory-method-dispose">Online Documentation</a>
 */
 open   fun dispose()

companion object : ClassMetadata<OrganicLayoutConstraintFactory> {
}
}
