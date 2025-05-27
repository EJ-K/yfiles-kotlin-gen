// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.analysis

import yfiles.lang.ClassMetadata
import yfiles.lang.YObject

/**
 * Represents the edges that have to be added to obtain the transitive closure of a graph as computed by [TransitiveClosure].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TransitiveClosureResult">Online Documentation</a>
 */
external  class TransitiveClosureResult 
private constructor () : YObject {

/**
 * Gets a collection of edge placeholders.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TransitiveClosureResult%23edgesToAdd">Online Documentation</a>
 */
final val edgesToAdd: ResultItemCollection<TransitiveEdge>

companion object : ClassMetadata<TransitiveClosureResult> {
}
}
