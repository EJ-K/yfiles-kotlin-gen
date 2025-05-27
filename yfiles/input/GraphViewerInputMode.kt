// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.input

import yfiles.lang.ClassMetadata

/**
 * An [IInputMode] implementation for use in a [GraphComponent][yfiles.view.GraphComponent] to assign to the [inputMode][yfiles.view.CanvasComponent] property.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphViewerInputMode">Online Documentation</a>
 * 
 * @constructor Initializes a new instance of the [GraphViewerInputMode] class.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphViewerInputMode%23GraphViewerInputMode-constructor-GraphViewerInputMode">Online Documentation</a>
 */
open external class GraphViewerInputMode () : GraphInputMode {
  
  companion object : ClassMetadata<GraphViewerInputMode> {
  }
}

inline fun GraphViewerInputMode(
    block: GraphViewerInputMode.() -> Unit
): GraphViewerInputMode {
    return GraphViewerInputMode()
        .apply(block)
}
