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
import yfiles.graph.INode
import yfiles.lang.ClassMetadata
import yfiles.layout.ContextItemMapping
import yfiles.layout.ItemCollection

/**
 * Provides different ways to define a mapping from model items to incremental hints for use with [HierarchicLayoutData].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IncrementalHintItemMapping">Online Documentation</a>
 * 
 * @constructor Creates a new instance of [IncrementalHintItemMapping].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IncrementalHintItemMapping%23IncrementalHintItemMapping-constructor-IncrementalHintItemMapping">Online Documentation</a>
 */
external  class IncrementalHintItemMapping  () : ContextItemMapping<IModelItem, IncrementalHint, IIncrementalHintsFactory> {

/**
 * Gets or sets an item collection of nodes that are mapped to [incremental layering hints][IIncrementalHintsFactory.createLayerIncrementallyHint].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IncrementalHintItemMapping%23incrementalLayeringNodes">Online Documentation</a>
 */
final var incrementalLayeringNodes: ItemCollection<INode>
/**
 * Gets or sets an item collection of nodes or edges that are mapped to [incremental sequencing hints][IIncrementalHintsFactory.createSequenceIncrementallyHint].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IncrementalHintItemMapping%23incrementalSequencingItems">Online Documentation</a>
 */
final var incrementalSequencingItems: ItemCollection<IModelItem>

companion object : ClassMetadata<IncrementalHintItemMapping> {
}
}

inline fun IncrementalHintItemMapping(
    block: IncrementalHintItemMapping.() -> Unit
): IncrementalHintItemMapping {
    return IncrementalHintItemMapping()
        .apply(block)
}
