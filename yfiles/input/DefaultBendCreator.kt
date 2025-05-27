// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.input

import yfiles.geometry.Point
import yfiles.graph.IEdge
import yfiles.graph.IGraph
import yfiles.lang.ClassMetadata

/**
 * The [IBendCreator] which is used by default to create bends interactively.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DefaultBendCreator">Online Documentation</a>
 */
external open class DefaultBendCreator  : IBendCreator {

/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DefaultBendCreator%23DefaultBendCreator-method-createBend">Online Documentation</a>
 */
 final override   fun createBend( context: IInputModeContext ,
 graph: IGraph ,
 edge: IEdge ,
 location: Point ):Int

companion object : ClassMetadata<DefaultBendCreator> {
}
}
