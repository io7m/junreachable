/*
 * Copyright © 2014 Mark Raynsford <code@io7m.com> https://www.io7m.com
 * 
 * Permission to use, copy, modify, and/or distribute this software for any
 * purpose with or without fee is hereby granted, provided that the above
 * copyright notice and this permission notice appear in all copies.
 * 
 * THE SOFTWARE IS PROVIDED "AS IS" AND THE AUTHOR DISCLAIMS ALL WARRANTIES
 * WITH REGARD TO THIS SOFTWARE INCLUDING ALL IMPLIED WARRANTIES OF
 * MERCHANTABILITY AND FITNESS. IN NO EVENT SHALL THE AUTHOR BE LIABLE FOR ANY
 * SPECIAL, DIRECT, INDIRECT, OR CONSEQUENTIAL DAMAGES OR ANY DAMAGES
 * WHATSOEVER RESULTING FROM LOSS OF USE, DATA OR PROFITS, WHETHER IN AN
 * ACTION OF CONTRACT, NEGLIGENCE OR OTHER TORTIOUS ACTION, ARISING OUT OF OR
 * IN CONNECTION WITH THE USE OR PERFORMANCE OF THIS SOFTWARE.
 */

package com.io7m.junreachable;

/**
 * The type of exceptions thrown upon reaching code that is currently
 * unimplemented.
 */

public final class UnimplementedCodeException extends RuntimeException
{
  private static final long serialVersionUID = 6032268577170183263L;

  /**
   * Construct a new exception without a specific cause.
   */

  public UnimplementedCodeException()
  {
    super("Reached unimplemented code: report this bug");
  }

  /**
   * Construct a new exception with the given cause.
   * 
   * @param x
   *          The cause
   */

  public UnimplementedCodeException(
    final Throwable x)
  {
    super("Reached unimplemented code: report this bug", x);
  }
}
