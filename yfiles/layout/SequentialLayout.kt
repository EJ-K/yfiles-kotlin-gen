// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.layout

import yfiles.collections.ICollection
import yfiles.collections.IList
import yfiles.lang.ClassMetadata

/**
 * A [SequentialLayout] allows for chaining multiple [layout algorithms][ILayoutAlgorithm].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SequentialLayout">Online Documentation</a>
 * 
 * @constructor Creates a new [SequentialLayout] instance with an empty chain of [layout algorithms][ILayoutAlgorithm].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SequentialLayout%23SequentialLayout-constructor-SequentialLayout">Online Documentation</a>
 */
external open class SequentialLayout  () : ILayoutAlgorithm {

/**
 * Gets or sets the chain of [layout algorithms][ILayoutAlgorithm].
 * @see [appendLayout]
 * @see [appendLayouts]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SequentialLayout%23layouts">Online Documentation</a>
 */
open var layouts: IList<out ILayoutAlgorithm>
/**
 * Appends the given [layout algorithm][ILayoutAlgorithm] to the end of the chain.
 * @param [layouter] the [layout algorithm][ILayoutAlgorithm] to append
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SequentialLayout%23SequentialLayout-method-appendLayout">Online Documentation</a>
 */
 open   fun appendLayout( layouter: ILayoutAlgorithm )
/**
 * Appends the specified list of [layout algorithms][ILayoutAlgorithm] to the end of the chain.
 * @param [layouters] the list of [layout algorithms][ILayoutAlgorithm] to append
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SequentialLayout%23SequentialLayout-method-appendLayouts">Online Documentation</a>
 */
 open   fun appendLayouts( layouters: ICollection<out ILayoutAlgorithm> )
/**
 * Executes all [layout algorithms][ILayoutAlgorithm] in the chain, one after the other.
 * @param [graph] the input graph
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SequentialLayout%23SequentialLayout-method-applyLayout">Online Documentation</a>
 */
 override   fun applyLayout( graph: LayoutGraph )
/**
 * Clears the current chain of [layout algorithms][ILayoutAlgorithm] and therefore removes all layout algorithms.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SequentialLayout%23SequentialLayout-method-removeAll">Online Documentation</a>
 */
 open   fun removeAll()

companion object : ClassMetadata<SequentialLayout> {
}
}

inline fun SequentialLayout(
    block: SequentialLayout.() -> Unit
): SequentialLayout {
    return SequentialLayout()
        .apply(block)
}
