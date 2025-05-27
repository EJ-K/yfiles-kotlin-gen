// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.organic

import yfiles.collections.ItemCollection
import yfiles.collections.ItemMapping
import yfiles.geometry.Rect
import yfiles.geometry.Size
import yfiles.lang.ClassMetadata
import yfiles.lang.IComparable
import yfiles.layout.ConstraintOrientation

/**
 * This class allows to define additional constraints on nodes of a graph that will be applied by the [OrganicLayout] during the layout calculation.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrganicConstraintData">Online Documentation</a>
 * 
 * @constructor
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrganicConstraintData%23OrganicConstraintData-constructor-OrganicConstraintData">Online Documentation</a>
 */
external class OrganicConstraintData<TNode> ()  {
  /**
   * Adds constraints that cause the given nodes to align parallel to the specified axis.
   * @param [axis] [HORIZONTAL][ConstraintOrientation] to align the nodes parallel to the x-axis, [VERTICAL][ConstraintOrientation] to align them parallel to the y-axis.
   * @param [range] The maximum horizontal distance between the centers of any two aligned nodes if the nodes are aligned vertically, and otherwise the maximum vertical distance between the centers of any two aligned nodes.
   * @return An [ItemCollection] that is used to define the nodes affected by this constraint.
   * @throws ArgumentError if the given alignment range is negative
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrganicConstraintData%23OrganicConstraintData-method-addAlignmentConstraint">Online Documentation</a>
   */
  fun addAlignmentConstraint(
    axis: ConstraintOrientation,
    range: Double  = definedExternally,
  ): ItemCollection<TNode>
  
  /**
   * Adds constraints that cause the specified nodes to be arranged on the border of an ellipse with the given aspect ratio.
   * @param [regularPlacement] `true` if the nodes should be placed in regular intervals along the border of the ellipse, `false` otherwise.
   * @param [aspectRatio] a positive ratio between the horizontal and vertical diameter of the ellipse, or `0`, if the ratio should be determined automatically.
   * @return An [ItemCollection] that is used to define the nodes affected by this constraint.
   * @throws ArgumentError if the given aspect ratio is negative
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrganicConstraintData%23OrganicConstraintData-method-addEllipse">Online Documentation</a>
   */
  fun addEllipse(
    regularPlacement: Boolean,
    aspectRatio: Double  = definedExternally,
  ): ItemCollection<TNode>
  
  /**
   * Adds constraints to fix the positions of the specified nodes in relation to one another along one coordinate axis.
   * @param [axis] [HORIZONTAL][ConstraintOrientation] to fix the distances along the x-axis, [VERTICAL][ConstraintOrientation] to fix the distances along the y-axis or [BOTH][ConstraintOrientation] to fix the node's positions relative to each other.
   * @return An [ItemCollection] that is used to define the nodes affected by this constraint.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrganicConstraintData%23OrganicConstraintData-method-addFixedDistances">Online Documentation</a>
   */
  fun addFixedDistances(
    axis: ConstraintOrientation,
  ): ItemCollection<TNode>
  
  /**
   * Adds constraints that prevent the specified nodes from occupying an area larger than the defined bounds.
   * @param [size] The maximum width and height of the bounds containing all specified nodes.
   * @return An [ItemCollection] that is used to define the nodes affected by this constraint.
   * @throws ArgumentError if width or height is negative.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrganicConstraintData%23OrganicConstraintData-method-addFloatingBounds">Online Documentation</a>
   */
  fun addFloatingBounds(
    size: Size,
  ): ItemCollection<TNode>
  
  /**
   * Adds constraints that enforce a maximum vertical or horizontal distance between the given nodes.
   * @param [node1] The first node that is constrained with respect to its maximum distance.
   * @param [node2] The second node that is constrained with respect to its maximum distance.
   * @param [distance] The largest allowed horizontal resp. vertical distance between both nodes. The distance is measured between the boundaries of the nodes.
   * @param [axis] The axis that is used for measuring the distance. [HORIZONTAL][ConstraintOrientation] to restrict the horizontal distance, [VERTICAL][ConstraintOrientation] to restrict the vertical distance or [BOTH][ConstraintOrientation] to restrict both.
   * @throws ArgumentError if the maximum distance is negative.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrganicConstraintData%23OrganicConstraintData-method-addMaximumDistance">Online Documentation</a>
   */
  fun addMaximumDistance(
    node1: TNode,
    node2: TNode,
    distance: Double,
    axis: ConstraintOrientation,
  )
  
  /**
   * Adds constraints that enforce a minimum distance between the given nodes.
   * @param [node1] The first of the two nodes that are constrained with respect to their minimum distance.
   * @param [node2] The second of the two nodes that are constrained with respect to their minimum distance.
   * @param [minimumDistance] The minimum required distance between the two nodes. The distance is measured between the boundaries of the nodes.
   * @throws ArgumentError if the minimum distance is negative.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrganicConstraintData%23OrganicConstraintData-method-addMinimumDistance">Online Documentation</a>
   */
  fun addMinimumDistance(
    node1: TNode,
    node2: TNode,
    minimumDistance: Double,
  )
  
  /**
   * Adds constraints that cause the given nodes to be placed along the specified axis in the order they are given.
   * @param [axis] [HORIZONTAL][ConstraintOrientation] to order the nodes along the x-axis, [VERTICAL][ConstraintOrientation] to order them along the y-axis or [BOTH][ConstraintOrientation] to order them along both axes.
   * @return An [ItemMapping] that can be used to specify the order of nodes along the given axis.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrganicConstraintData%23OrganicConstraintData-method-addOrderConstraint">Online Documentation</a>
   */
  fun addOrderConstraint(
    axis: ConstraintOrientation,
  ): ItemMapping<TNode, IComparable<*>>
  
  /**
   * Adds constraints that prevent the given nodes from being placed outside the specified rectangle.
   * @param [rectangle] The coordinates of the rectangle.
   * @return An [ItemCollection] that is used to define the nodes affected by this constraint.
   * @throws ArgumentError if width or height is negative.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrganicConstraintData%23OrganicConstraintData-method-addPinnedBounds">Online Documentation</a>
   */
  fun addPinnedBounds(
    rectangle: Rect,
  ): ItemCollection<TNode>
  
  /**
   * Adds constraints that cause the specified nodes to be arranged on the border of a rectangle with the given aspect ratio.
   * @param [aspectRatio] a positive ratio between the width and height of the rectangle, or `0`, if the ratio should be calculated automatically.
   * @return An [ItemCollection] that is used to define the nodes affected by this constraint.
   * @throws ArgumentError if the given aspect ratio is negative
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrganicConstraintData%23OrganicConstraintData-method-addRectangle">Online Documentation</a>
   */
  fun addRectangle(
    aspectRatio: Double  = definedExternally,
  ): ItemCollection<TNode>
  
  /**
   * Adds constraints that cause the given nodes to be aligned parallel to the specified axis.
   * @param [axis] [HORIZONTAL][ConstraintOrientation] to align the nodes parallel to the x-axis, [VERTICAL][ConstraintOrientation] to align them parallel to the y-axis.
   * @param [distance] The distance between neighboring nodes along the alignment. If the value is negative, the distance is determined automatically.
   * @return An [ItemCollection] that is used to define the nodes affected by this constraint.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrganicConstraintData%23OrganicConstraintData-method-addRegularAlignmentConstraint">Online Documentation</a>
   */
  fun addRegularAlignmentConstraint(
    axis: ConstraintOrientation,
    distance: Double  = definedExternally,
  ): ItemCollection<TNode>
  
  /**
   * Adds constraints that enforce a minimum distance between two sets of nodes.
   * @param [axis] [HORIZONTAL][ConstraintOrientation] to separate the nodes along the x-axis, [VERTICAL][ConstraintOrientation] to separate them along the y-axis, [BOTH][ConstraintOrientation] to separate them along both axes.
   * @param [minimumDistance] The minimum distance by which the two sets are separated.
   * @return An [OrganicLayoutSeparationConstraint] that is used to define the two sets of nodes that should be separated.
   * @throws ArgumentError if the minimum distance is negative.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrganicConstraintData%23OrganicConstraintData-method-addSeparationConstraint">Online Documentation</a>
   */
  fun addSeparationConstraint(
    axis: ConstraintOrientation,
    minimumDistance: Double,
  ): OrganicLayoutSeparationConstraint<TNode>
  
  companion object : ClassMetadata<OrganicConstraintData<*>> {
  }
}
