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
 * Represents the cliques found by [CliqueSubstructures].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CliqueSubstructuresResult">Online Documentation</a>
 */
external  class CliqueSubstructuresResult 
private constructor () : YObject {

/**
 * Gets the cliques found by [CliqueSubstructures].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CliqueSubstructuresResult%23cliques">Online Documentation</a>
 */
final val cliques: ResultItemCollection<SubstructureItems>

companion object : ClassMetadata<CliqueSubstructuresResult> {
}
}
