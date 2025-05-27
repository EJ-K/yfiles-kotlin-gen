// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.view

import yfiles.lang.ClassMetadata

/**
 * A void/null implementation of the [IVisualCreator] interface that does nothing.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/VoidVisualCreator">Online Documentation</a>
 */
external  class VoidVisualCreator 
private constructor () : IVisualCreator {

/**
 * Returns `null`.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/VoidVisualCreator%23VoidVisualCreator-method-createVisual">Online Documentation</a>
 */
 final override   fun createVisual( context: IRenderContext ):Visual?
/**
 * Returns `null`.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/VoidVisualCreator%23VoidVisualCreator-method-updateVisual">Online Documentation</a>
 */
 final override   fun updateVisual( context: IRenderContext ,
 oldVisual: Visual? ):Visual?

companion object : ClassMetadata<VoidVisualCreator> {
/**
 * An immutable and shareable instance of the [VoidVisualCreator] class.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/VoidVisualCreator%23INSTANCE">Online Documentation</a>
 */
 val INSTANCE: IVisualCreator
}
}
