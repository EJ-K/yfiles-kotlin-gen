// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.algorithms

import yfiles.collections.IList
import yfiles.lang.ClassMetadata
import yfiles.lang.YObject

/**
 * Represents a dart of a face of a [PlanarEmbedding].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Dart">Online Documentation</a>
 */
external  class Dart 
private constructor () : YObject {

/**
 * Gets the edge associated with this dart.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Dart%23associatedEdge">Online Documentation</a>
 */
final val associatedEdge: Edge
/**
 * Gets the face list associated with this dart.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Dart%23face">Online Documentation</a>
 */
final val face: IList<out Dart>
/**
 * Gets the opposite dart.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Dart%23oppositeDart">Online Documentation</a>
 */
final val oppositeDart: Dart?
/**
 * Gets whether this dart represents the original edge or its reverse.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Dart%23reversed">Online Documentation</a>
 */
final val reversed: Boolean

companion object : ClassMetadata<Dart> {
}
}
