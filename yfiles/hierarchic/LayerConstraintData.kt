// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.hierarchic

import yfiles.collections.ItemMapping
import yfiles.lang.ClassMetadata
import yfiles.lang.IComparable

/**
 * Specifies layer constraints for nodes for a [HierarchicalLayout].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayerConstraintData">Online Documentation</a>
 * 
 * @constructor
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayerConstraintData%23LayerConstraintData-constructor-LayerConstraintData">Online Documentation</a>
 */
external class LayerConstraintData<TNode> ()  {
  /**
   * Gets or sets the mapping from nodes to an [IComparable] (for example a number or string) defining their layer constraints.
   * @see [GivenLayersAssigner.LAYER_INDEX_DATA_KEY]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayerConstraintData%23nodeComparables">Online Documentation</a>
   */
  final var nodeComparables: ItemMapping<TNode, IComparable<*>>
  
  /**
   * Clears all previously defined constraints.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayerConstraintData%23LayerConstraintData-method-clearConstraints">Online Documentation</a>
   */
  fun clearConstraints()
  
  /**
   * Adds a constraint that places the `node` on the bottom layer.
   * @param [node] the node that should lie on the bottom layer
   * @param [priority] the priority of the constraint. If multiple constraints conflict, the ones with lower priority will be discarded.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayerConstraintData%23LayerConstraintData-method-placeAtBottom">Online Documentation</a>
   */
  fun placeAtBottom(
    node: TNode,
    priority: Int  = definedExternally,
  )
  
  /**
   * Adds a constraint that places the `node` on the topmost layer.
   * @param [node] the node that should lie on the top layer
   * @param [priority] the priority of the constraint. If multiple constraints conflict, the ones with lower priority will be discarded.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayerConstraintData%23LayerConstraintData-method-placeAtTop">Online Documentation</a>
   */
  fun placeAtTop(
    node: TNode,
    priority: Int  = definedExternally,
  )
  
  /**
   * Adds a constraint that forces the `upperNode` to lie at least `minimumDistance` layers above the `lowerNode` with a given `weight` penalty for larger layer differences.
   * @param [upperNode] the upper node
   * @param [lowerNode] the lower node that should lie below the upper node
   * @param [minimumDistance] the minimum layer distance between the node and its reference node
   * @param [weight] the weight penalty for larger layer differences
   * @param [priority] the priority of the constraint. If multiple constraints conflict, the ones with lower priority will be discarded.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayerConstraintData%23LayerConstraintData-method-placeInOrder">Online Documentation</a>
   */
  fun placeInOrder(
    upperNode: TNode,
    lowerNode: TNode,
    minimumDistance: Double  = definedExternally,
    weight: Double  = definedExternally,
    priority: Int  = definedExternally,
  )
  
  /**
   * Adds a constraint that forces the `sameLayerNode` to lie in the same layer as the `referenceNode`.
   * @param [referenceNode] the reference node
   * @param [sameLayerNode] the node that should lie in the same layer
   * @param [priority] the priority of the constraint. If multiple constraints conflict, the ones with lower priority will be discarded.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayerConstraintData%23LayerConstraintData-method-placeInSameLayer">Online Documentation</a>
   */
  fun placeInSameLayer(
    referenceNode: TNode,
    sameLayerNode: TNode,
    priority: Int  = definedExternally,
  )
  
  companion object : ClassMetadata<LayerConstraintData<*>> {
  }
}
