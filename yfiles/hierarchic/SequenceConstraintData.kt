// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.hierarchic

import yfiles.graph.IModelItem
import yfiles.lang.ClassMetadata
import yfiles.lang.IComparable
import yfiles.layout.ItemMapping
import yfiles.layout.LayoutData

/**
 * Specifies sequence constraints for [nodes][yfiles.graph.INode] and [edges][yfiles.graph.IEdge] for a [HierarchicLayout].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SequenceConstraintData">Online Documentation</a>
 * 
 * @constructor Creates a new instance of [SequenceConstraintData] which helps configuring sequence constraints for [HierarchicLayout].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SequenceConstraintData%23SequenceConstraintData-constructor-SequenceConstraintData">Online Documentation</a>
 */
external open class SequenceConstraintData  () : LayoutData {

/**
 * Gets or set the mapping from nodes or edges to an [IComparable] (for example a number or string) defining their sequence sort order.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SequenceConstraintData%23itemComparables">Online Documentation</a>
 */
final var itemComparables: ItemMapping<IModelItem, IComparable<*>>
/**
 * Clears all previously defined constraints.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SequenceConstraintData%23SequenceConstraintData-method-clearConstraints">Online Documentation</a>
 */
 final   fun clearConstraints()
/**
 * Adds a constraint that forces the `afterItem` of type [INode][yfiles.graph.INode] or [IEdge][yfiles.graph.IEdge] to lie after the `item` of type [INode][yfiles.graph.INode] or [IEdge][yfiles.graph.IEdge].
 * @param [item] the reference node or edge
 * @param [afterItem] the node or edge that should be placed after the reference element
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SequenceConstraintData%23SequenceConstraintData-method-placeAfter">Online Documentation</a>
 */
 final   fun placeAfter( item: IModelItem ,
 afterItem: IModelItem )
/**
 * Adds a constraint that places a [INode][yfiles.graph.INode] or [IEdge][yfiles.graph.IEdge] at the start of the sequence.
 * @param [item] the node or edge that should be placed at the start
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SequenceConstraintData%23SequenceConstraintData-method-placeAtHead">Online Documentation</a>
 */
 final   fun placeAtHead( item: IModelItem )
/**
 * Adds a constraint that places a [INode][yfiles.graph.INode] or [IEdge][yfiles.graph.IEdge] at the end of the sequence.
 * @param [item] the node or edge that should be placed at the end
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SequenceConstraintData%23SequenceConstraintData-method-placeAtTail">Online Documentation</a>
 */
 final   fun placeAtTail( item: IModelItem )
/**
 * Adds a constraint that forces the `beforeItem` of type [INode][yfiles.graph.INode] or [IEdge][yfiles.graph.IEdge] to lie before the `item` of type [INode][yfiles.graph.INode] or [IEdge][yfiles.graph.IEdge].
 * @param [item] the reference node or edge
 * @param [beforeItem] the node or edge that should be placed before the reference element
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SequenceConstraintData%23SequenceConstraintData-method-placeBefore">Online Documentation</a>
 */
 final   fun placeBefore( item: IModelItem ,
 beforeItem: IModelItem )

companion object : ClassMetadata<SequenceConstraintData> {
}
}

inline fun SequenceConstraintData(
    block: SequenceConstraintData.() -> Unit
): SequenceConstraintData {
    return SequenceConstraintData()
        .apply(block)
}
