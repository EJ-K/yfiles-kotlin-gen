// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.hierarchic

import yfiles.graph.INode
import yfiles.lang.ClassMetadata
import yfiles.lang.IComparable
import yfiles.layout.ItemMapping
import yfiles.layout.LayoutData

/**
 * Specifies layer constraints for [nodes][INode] for a [HierarchicLayout].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayerConstraintData">Online Documentation</a>
 * 
 * @constructor Creates a new instance of [LayerConstraintData] which helps configuring [ILayerConstraint]s for [HierarchicLayout].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayerConstraintData%23LayerConstraintData-constructor-LayerConstraintData">Online Documentation</a>
 */
external open class LayerConstraintData  () : LayoutData {

/**
 * Gets or set the mapping from nodes to an [IComparable] (for example a number or string) defining their layer constraints.
 * @see [GivenLayersLayerer.LAYER_ID_DP_KEY]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayerConstraintData%23nodeComparables">Online Documentation</a>
 */
final var nodeComparables: ItemMapping<INode, IComparable<*>>
/**
 * Clears all previously defined constraints.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayerConstraintData%23LayerConstraintData-method-clearConstraints">Online Documentation</a>
 */
 final   fun clearConstraints()
/**
 * Adds a constraint that forces the `aboveNode` to lie at least `minDistance` layers above the `referenceNode` with a given `weight` penalty for larger layer differences.
 * @param [referenceNode] the reference node
 * @param [aboveNode] the node that should lie above
 * @param [minDistance] the minimum layer distance between the node and its reference node
 * @param [weight] the weight penalty for larger layer differences
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayerConstraintData%23LayerConstraintData-method-placeAbove">Online Documentation</a>
 */
 final   fun placeAbove( referenceNode: INode ,
 aboveNode: INode ,
 minDistance: Double  = definedExternally,
 weight: Double  = definedExternally)
/**
 * Adds a constraint that places the `node` on the bottom layer.
 * @param [node] the node that should lie on the bottom layer
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayerConstraintData%23LayerConstraintData-method-placeAtBottom">Online Documentation</a>
 */
 final   fun placeAtBottom( node: INode )
/**
 * Adds a constraint that places the `node` on the topmost layer.
 * @param [node] the node that should lie on the top layer
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayerConstraintData%23LayerConstraintData-method-placeAtTop">Online Documentation</a>
 */
 final   fun placeAtTop( node: INode )
/**
 * Adds a constraint that forces the `belowNode` to lie at least `minDistance` layers below the `referenceNode` with a given `weight` penalty for larger layer differences.
 * @param [referenceNode] the reference node
 * @param [belowNode] the node that should lie below
 * @param [minDistance] the minimum layer distance between the node and its reference node
 * @param [weight] the weight penalty for larger layer differences
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayerConstraintData%23LayerConstraintData-method-placeBelow">Online Documentation</a>
 */
 final   fun placeBelow( referenceNode: INode ,
 belowNode: INode ,
 minDistance: Double  = definedExternally,
 weight: Double  = definedExternally)
/**
 * Adds a constraint that forces the the `sameLayerNode` to lie in the same layer as the `referenceNode`.
 * @param [referenceNode] the reference node
 * @param [sameLayerNode] the node that should lie in the same layer
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayerConstraintData%23LayerConstraintData-method-placeInSameLayer">Online Documentation</a>
 */
 final   fun placeInSameLayer( referenceNode: INode ,
 sameLayerNode: INode )

companion object : ClassMetadata<LayerConstraintData> {
}
}

inline fun LayerConstraintData(
    block: LayerConstraintData.() -> Unit
): LayerConstraintData {
    return LayerConstraintData()
        .apply(block)
}
