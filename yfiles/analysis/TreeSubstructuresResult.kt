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
 * Represents the trees found by [TreeSubstructures].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TreeSubstructuresResult">Online Documentation</a>
 */
external  class TreeSubstructuresResult 
private constructor () : YObject {

/**
 * Gets the trees found by [TreeSubstructures].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TreeSubstructuresResult%23trees">Online Documentation</a>
 */
final val trees: ResultItemCollection<SubstructureItems>

companion object : ClassMetadata<TreeSubstructuresResult> {
}
}
